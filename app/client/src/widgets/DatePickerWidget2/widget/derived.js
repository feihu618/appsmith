export default {
  isValidDate: (props, moment, _) => {
    if (props.isRequired) {
      const minDate = new Date(props.minDate);
      const maxDate = new Date(props.maxDate);
      // for no selectedDate moment.isBetween returns false
      const selectedDate = new Date(props.selectedDate);
      const isValid = moment(selectedDate).isBetween(minDate, maxDate);
      return isValid;
    }
    return true;
  },
  //
};
